package com.application.sandbox.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.function.Supplier;


@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class BaseJpaRepository {
    public <T>Mono<T> monoFromBlocking(final Supplier<T> supplier) {
        return Mono.fromSupplier(supplier)
                .subscribeOn(Schedulers.boundedElastic());
    }

    public <T>Flux<T> fluxFromBlocking(final @NotNull Supplier<Iterable<T>> supplier) {
        return Flux.fromIterable(supplier.get())
                .subscribeOn(Schedulers.boundedElastic());
    }
}
