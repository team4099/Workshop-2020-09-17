package com.team4099.lib.units.base

import com.team4099.lib.units.UnitKey
import com.team4099.lib.units.Value
import com.team4099.lib.units.atto
import com.team4099.lib.units.centi
import com.team4099.lib.units.deci
import com.team4099.lib.units.femto
import com.team4099.lib.units.micro
import com.team4099.lib.units.milli
import com.team4099.lib.units.nano
import com.team4099.lib.units.pico
import com.team4099.lib.units.yocto
import com.team4099.lib.units.zepto

object Second : UnitKey

typealias Time = Value<Second>

internal const val SECONDS_PER_MINUTE = 60
internal const val SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60

val Double.seconds: Time get() = Time(this)
val Double.minutes: Time get() = Time(this * SECONDS_PER_MINUTE)
val Double.hours: Time get() = Time(this * SECONDS_PER_HOUR)

val Number.seconds: Time get() = toDouble().seconds
val Number.minutes: Time get() = toDouble().minutes
val Number.hours: Time get() = toDouble().hours

val Time.inSeconds : Double get() = value
val Time.inMinutes : Double get() = value / SECONDS_PER_MINUTE
val Time.inHours : Double get() = value / SECONDS_PER_HOUR

val Time.inDeciseconds : Double get() = value.deci
val Time.inCentiseconds : Double get() = value.centi
val Time.inMilliseconds : Double get() = value.milli
val Time.inMicroseconds : Double get() = value.micro
val Time.inNanoseconds : Double get() = value.nano
val Time.inPicoseconds : Double get() = value.pico
val Time.inFemtoseconds : Double get() = value.femto
val Time.inAttoseconds : Double get() = value.atto
val Time.inZeptoseconds : Double get() = value.zepto
val Time.inYoctoseconds : Double get() = value.yocto
