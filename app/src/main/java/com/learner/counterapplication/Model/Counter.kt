package com.learner.counterapplication.Model

data class Counter(var count: Int)

class CounterRepository{
    private var _counter = Counter(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }

    fun decrementCounter(){
        _counter.count--
    }
}