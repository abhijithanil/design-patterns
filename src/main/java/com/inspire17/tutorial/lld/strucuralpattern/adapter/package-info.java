/**
 * Adapter design pattern
 *
 * <p>Match interface of different classes You can create an adapter. This is a special object that
 * converts the interface of one object so that another object can understand it.
 *
 * <p>Server1 ------xml-----> client ----->xml----> Server2[accepts json] X Failed
 *
 * <p>Server1 ------xml-----> client[convert xml to Json] ----->json----> Server2[accepts json]
 * Success
 *
 * <p>pojo to json to send to web service follows adapter pattern
 */
package com.inspire17.tutorial.lld.strucuralpattern.adapter;
