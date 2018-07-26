package com.krisdrum

import java.util.Properties

import org.apache.kafka.common.serialization.Serdes
import org.apache.kafka.streams.StreamsConfig

trait Config {
  val settings = new Properties()
  settings.put(StreamsConfig.APPLICATION_ID_CONFIG, "first-streaming-application")
  settings.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka-broker1:9092")
  settings.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String())
  settings.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String())

  val config = new StreamsConfig(settings)
}
