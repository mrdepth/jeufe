/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class DronesList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DronesList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DronesList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_DronesList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DronesList() {
    this(eufeJNI.new_DronesList__SWIG_0(), true);
  }

  public DronesList(long n) {
    this(eufeJNI.new_DronesList__SWIG_1(n), true);
  }

  public long size() {
    return eufeJNI.DronesList_size(swigCPtr, this);
  }

  public long capacity() {
    return eufeJNI.DronesList_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    eufeJNI.DronesList_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return eufeJNI.DronesList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    eufeJNI.DronesList_clear(swigCPtr, this);
  }

  public void add(Drone x) {
    eufeJNI.DronesList_add(swigCPtr, this, Drone.getCPtr(x), x);
  }

  public Drone get(int i) {
    long cPtr = eufeJNI.DronesList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Drone(cPtr, false);
  }

  public void set(int i, Drone val) {
    eufeJNI.DronesList_set(swigCPtr, this, i, Drone.getCPtr(val), val);
  }

}
