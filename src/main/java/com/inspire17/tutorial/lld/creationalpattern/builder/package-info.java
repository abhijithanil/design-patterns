/**
 * Builder Design pattern
 *
 * <p>The builder pattern, as name implies, is an alternative way to construct complex objects. This
 * pattern should be used when we want to build different immutable objects using the same object
 * building process.
 *
 * <p>n normal practice, if we want to make a immutable class, then we must pass all parameters to
 * constructor. It will look like this: private User(String firstName, String secondName, String
 * address), but in this case you can create object with information what you need.
 *
 * @since 1.0
 * @reference https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
 */
package com.inspire17.tutorial.lld.creationalpattern.builder;
