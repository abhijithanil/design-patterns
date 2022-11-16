/**
 * Singleton Design pattern
 *
 * <p>One instance of the class is available for the whole lifecycle Mutliple initialization is
 * possible for singleton classes 1. Eager singleton {@link
 * com.inspire17.tutorial.lld.creationalpattern.singleton.EagerDataBank} - eager initialization, which mean
 * when ever the class loader loads * the classes, the instance gets created. 2. Lazy singleton
 * {@link com.inspire17.tutorial.lld.creationalpattern.singleton.LazyDataBank} 3. thread safe singleton
 * {@link com.inspire17.tutorial.lld.creationalpattern.singleton.ThreadSafeDataBank} 4. static block
 * singleton {@link com.inspire17.tutorial.lld.creationalpattern.singleton.StaticDataBank} The
 * disadvantage, singleton makes it difficult to unit test
 */
package com.inspire17.tutorial.lld.creationalpattern.singleton;
