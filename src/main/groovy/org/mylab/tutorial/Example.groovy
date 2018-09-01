package org.mylab.tutorial

// Public classes and methods by default
class Example {
    static void main(String[] args) {
        // Using a simple println statement to print output to the console
        println('Hello World')

        // Dynamic types
        def x = 5
        println("x=" + x)

        println 'No () needed woooooo.'

        // Range operation
        def range = 5..10;
        println(range);
        println(range.get(2));

        printForIn()
    }

    static def printForIn() {
        def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];

        for(emp in employee) {
            println(emp);
        }
    }

    def props() {
        def m1 = [a: 1, b: 2]
        m2 = m1.findAll { k, v -> v % 2 == 0 }
        m2.c = 3
        m2 // return this
    }

    // Preferred
    void doSomething1(param1, param2) { }
    // or
    void doSomething2(def param1, def param2) { }
    // don't do
    void doSomething3(def String param1, def String param2) { }

    // def will make the type to be an Object class

    // Default params
    def someMethod(parameter1, parameter2 = 0, parameter3 = 0) {
        // Method code goes here
    }
}
