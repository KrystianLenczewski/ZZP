package com.tt.concurrent.callable;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * 1. Stwórz pulę wątków
 * 	a) Wykorzystaj Runtime.getRuntime().availableProcessors() aby pobrać ilość dostępnych procesów
 * 	b) pulę stwórz wykorzystując Executors.newFixedThreadPool(numberOfThreads);
 * 2. Stwórz zadania ComplexMathCallable w zależności od ilości wątków
 * 3. Zgłoś zadania do wykonania (metoda submit);
 * 4. Odłóż zwracane obiekty typu Future na listę - przydadzą się przy pobieraniu wyników
 * 5. Przeiteruj po liście i wywołaj metodę get() na obiektach Future
 * 	a) pamiętaj, że poszczególne wyniki należy zsumować
 * 6. Pamiętaj o zamknięciu ExecutorService'u - executor.shutdown();
 * 7. Zaprezentuj wyniki i zinterpretuj czas wykonania
 *
 */
public class ComplexMathRunner {



	public static void main(String[] args) {

		ComplexMath cm = new ComplexMath(8000, 8000);
		long startTime=System.currentTimeMillis();

		int numberOfThreads=Runtime.getRuntime().availableProcessors();
		List<Future>allFutures=new ArrayList<>();
		ExecutorService service= Executors.newFixedThreadPool(numberOfThreads);


		System.out.println("Number of processors: " + numberOfThreads);

		int k=0;
		final int partOfThread = 8000 / numberOfThreads;

		for (int i = 0; i < numberOfThreads; i++) {

			Future<Double>future;

			ComplexMath complexMath=new ComplexMath(0,0);

			if (i != numberOfThreads - 1) {
				complexMath.setMatrix(Arrays.copyOfRange(cm.getMatrix(), k, k + partOfThread));
				k += partOfThread;
			} else {
				complexMath.setMatrix(Arrays.copyOfRange(cm.getMatrix(), k, 8000));
			}

			future=service.submit(new ComplexMathCallable(complexMath));


			allFutures.add(future);

		}

		double result = 0d;
		for (int i = 0; i < allFutures.size(); i++) {
			Future<Double> future=allFutures.get(i);

			try{
				result+=future.get();


			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			catch (ExecutionException e)
			{
				e.printStackTrace();
			}

		}
		System.out.println("Result: " + result);
		System.out.println("Execution time: " + ((System.currentTimeMillis() - startTime) / 1000d) + " seconds.");
		service.shutdown();

		System.out.println("\n");
		System.out.println("Number of processors: 1");

		startTime = System.currentTimeMillis();
		System.out.println("Result: " + cm.calculate());
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time: " + ((endTime - startTime) / 1000d) + " seconds.");
	}

	private static class ComplexMathCallable implements Callable<Double> {

		private ComplexMath complexMath;
		public ComplexMathCallable(ComplexMath cm) {
			this.complexMath = cm;
		}

		@Override
		public Double call() throws Exception {
			return complexMath.calculate();
		}
	}

}
//Execution time: 3.01 seconds.