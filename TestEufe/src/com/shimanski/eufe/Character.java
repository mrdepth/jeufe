/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class Character extends Item {
  private long swigCPtr;

  protected Character(long cPtr, boolean cMemoryOwn) {
    super(eufeJNI.Character_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Character obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_Character(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Ship getShip() {
    long cPtr = eufeJNI.Character_getShip(swigCPtr, this);
    return (cPtr == 0) ? null : new Ship(cPtr, false);
  }

  public Ship setShip(int typeID) {
    long cPtr = eufeJNI.Character_setShip(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Ship(cPtr, false);
  }

  public Skill getSkill(int typeID) {
    long cPtr = eufeJNI.Character_getSkill(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Skill(cPtr, false);
  }

  public boolean emptyImplantSlot(int slot) {
    return eufeJNI.Character_emptyImplantSlot(swigCPtr, this, slot);
  }

  public boolean emptyBoosterSlot(int slot) {
    return eufeJNI.Character_emptyBoosterSlot(swigCPtr, this, slot);
  }

  public Implant getImplant(int slot) {
    long cPtr = eufeJNI.Character_getImplant(swigCPtr, this, slot);
    return (cPtr == 0) ? null : new Implant(cPtr, false);
  }

  public Booster getBooster(int slot) {
    long cPtr = eufeJNI.Character_getBooster(swigCPtr, this, slot);
    return (cPtr == 0) ? null : new Booster(cPtr, false);
  }

  public Implant addImplant(int typeID) {
    long cPtr = eufeJNI.Character_addImplant__SWIG_0(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Implant(cPtr, false);
  }

  public Implant addImplant(Implant implant) {
    long cPtr = eufeJNI.Character_addImplant__SWIG_1(swigCPtr, this, Implant.getCPtr(implant), implant);
    return (cPtr == 0) ? null : new Implant(cPtr, false);
  }

  public Booster addBooster(int typeID) {
    long cPtr = eufeJNI.Character_addBooster__SWIG_0(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Booster(cPtr, false);
  }

  public Booster addBooster(Booster booster) {
    long cPtr = eufeJNI.Character_addBooster__SWIG_1(swigCPtr, this, Booster.getCPtr(booster), booster);
    return (cPtr == 0) ? null : new Booster(cPtr, false);
  }

  public void removeImplant(Implant implant) {
    eufeJNI.Character_removeImplant(swigCPtr, this, Implant.getCPtr(implant), implant);
  }

  public void removeBooster(Booster booster) {
    eufeJNI.Character_removeBooster(swigCPtr, this, Booster.getCPtr(booster), booster);
  }

  public ImplantsList getImplants() {
    return new ImplantsList(eufeJNI.Character_getImplants(swigCPtr, this), true);
  }

  public BoostersList getBoosters() {
    return new BoostersList(eufeJNI.Character_getBoosters(swigCPtr, this), true);
  }

  public void setCharacterName(String characterName) {
    eufeJNI.Character_setCharacterName__SWIG_0(swigCPtr, this, characterName);
  }

  public void setCharacterName() {
    eufeJNI.Character_setCharacterName__SWIG_1(swigCPtr, this);
  }

  public String getCharacterName() {
    return eufeJNI.Character_getCharacterName(swigCPtr, this);
  }

  public void setSkillLevels(SkillLevelsMap levels) {
    eufeJNI.Character_setSkillLevels(swigCPtr, this, SkillLevelsMap.getCPtr(levels), levels);
  }

  public void setAllSkillsLevel(int level) {
    eufeJNI.Character_setAllSkillsLevel(swigCPtr, this, level);
  }

}
