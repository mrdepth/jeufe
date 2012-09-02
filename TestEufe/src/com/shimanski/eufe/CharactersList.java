/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class CharactersList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CharactersList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CharactersList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_CharactersList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CharactersList() {
    this(eufeJNI.new_CharactersList(), true);
  }

  public long size() {
    return eufeJNI.CharactersList_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return eufeJNI.CharactersList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    eufeJNI.CharactersList_clear(swigCPtr, this);
  }

  public void add(Character x) {
    eufeJNI.CharactersList_add(swigCPtr, this, Character.getCPtr(x), x);
  }

  public Character get(int i) {
    long cPtr = eufeJNI.CharactersList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Character(cPtr, false);
  }

}