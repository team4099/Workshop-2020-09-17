package com.team4099.lib.units

import com.team4099.lib.units.base.METERS_PER_FOOT
import com.team4099.lib.units.base.METERS_PER_INCH
import com.team4099.lib.units.base.Meter
import com.team4099.lib.units.base.SECONDS_PER_MINUTE
import com.team4099.lib.units.base.Second
import com.team4099.lib.units.derived.Angle
import com.team4099.lib.units.derived.Radian

typealias Velocity<K> = Fraction<K, Second>
typealias Acceleration<K> = Fraction<Velocity<K>, Second>

typealias LinearVelocity = Value<Velocity<Meter>>
typealias AngularVelocity = Value<Velocity<Radian>>
typealias LinearAcceleration = Value<Acceleration<Meter>>
typealias AngularAcceleration = Value<Acceleration<Radian>>

val <K: UnitKey> Value<K>.perSecond get() = Value<Velocity<K>>(value)
val <K: UnitKey> Value<K>.perMinute get() = Value<Velocity<K>>(value / SECONDS_PER_MINUTE)

val LinearVelocity.inMetersPerSecond : Double get() = value
val LinearVelocity.inFeetPerSecond : Double get() = value / METERS_PER_FOOT
val LinearVelocity.inFeetPerMinute : Double get() = inFeetPerSecond * SECONDS_PER_MINUTE
val LinearVelocity.inInchesPerSecond : Double get() = value / METERS_PER_INCH

val AngularVelocity.inRadiansPerSecond : Double get() = value
val AngularVelocity.inDegreesPerSecond : Double get() = Math.toDegrees(value)

val LinearAcceleration.inMetersPerSecondPerSecond : Double get() = value
val LinearAcceleration.inFeetPerSecondPerSecond : Double get() = value / METERS_PER_FOOT
val LinearAcceleration.inFeetPerMinutePerSecond : Double get() = inFeetPerSecondPerSecond * SECONDS_PER_MINUTE
val LinearAcceleration.inInchesPerSecondPerSecond : Double get() = value / METERS_PER_INCH
