package org.vikulin.opengammakit.model

import kotlinx.serialization.Serializable

@Serializable
data class GammaKitData(
    val schemaVersion: String,
    val data: List<GammaKitEntry>
)

@Serializable
data class GammaKitEntry(
    val deviceData: DeviceData,
    val resultData: ResultData
)

@Serializable
data class DeviceData(
    val softwareName: String,
    val deviceName: String
)

@Serializable
data class ResultData(
    val energySpectrum: EnergySpectrum
)

@Serializable
data class EnergySpectrum(
    val numberOfChannels: Int,
    val measurementTime: Long,
    val spectrum: List<Int>,
    val validPulseCount: Long,
)
