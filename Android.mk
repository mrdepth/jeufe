LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

NDK_TOOLCHAIN_VERSION := 4.6

LOCAL_MODULE := eufe
LOCAL_CPP_EXTENSION := .cxx .cpp .cc .hpp

LOCAL_CPP_FEATURES := exceptions rtti

LOCAL_CPPFLAGS += -D _DEBUG
LOCAL_CPPFLAGS += -D __GLIBC__
LOCAL_CPPFLAGS += -D BOOST_ALL_NO_LIB

LOCAL_C_INCLUDES += $(BOOST_PATH)

LOCAL_SRC_FILES := \
Mutex.cpp \
Item.cpp \
ThirdParty/sqlite3.c \
eufe_wrap.cxx \
Area.cpp \
Attribute.cpp \
Booster.cpp \
CapacitorSimulator.cpp \
Character.cpp \
Charge.cpp \
ControlTower.cpp \
DamagePattern.cpp \
Drone.cpp \
Effect.cpp \
EffectAdaptiveArmorHardener.cpp \
EffectArmorRepairInterpreter.cpp \
EffectByteCodeInterpreter.cpp \
EffectEnergyDestabilizationNewInterpreter.cpp \
EffectEnergyTransferInterpreter.cpp \
EffecthardPointModifierEffectInterpreter.cpp \
EffectHullRepairInterpreter.cpp \
EffectLeechInterpreter.cpp \
EffectShieldBoostingInterpreter.cpp \
EffectSlotModifierInterpreter.cpp \
Engine.cpp \
Gang.cpp \
HeatSimulator.cpp \
Implant.cpp \
LocationGroupModifier.cpp \
LocationRequiredSkillModifier.cpp \
Modifier.cpp \
Module.cpp \
Ship.cpp \
Skill.cpp \
Structure.cpp \



include $(BUILD_SHARED_LIBRARY)
