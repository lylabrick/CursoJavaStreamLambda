package com.cursojavaadvanced.runnableexample;

import java.util.concurrent.*;

public class ExampleCallable {

    public static void main(String[] args) {
        // Example usage of Callable
        Callable<Integer> tarea = () -> {
            return 42; // devuelve un resultado
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(tarea);

        try {
            Integer resultado = future.get(); // bloquea hasta que la tarea termina
            System.out.println(resultado); // 42
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restaura el estado de interrupción
            System.err.println("La tarea fue interrumpida: " + e.getMessage());
        } catch (ExecutionException e) {
            System.err.println("La tarea lanzó una excepción: " + e.getCause());
        } finally {
            executor.shutdown(); // Es importante apagar el ExecutorService
        }

    }
}
