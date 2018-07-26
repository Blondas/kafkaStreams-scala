package com.krisdrum

import com.typesafe.scalalogging.LazyLogging
import org.apache.kafka.streams.{KafkaStreams, StreamsBuilder, StreamsConfig, Topology}

object Test  extends App with LazyLogging {
  val builder: StreamsBuilder = ???
  val topology: Topology = ???
  val config: StreamsConfig = ???

  val stream: KafkaStreams = new KafkaStreams(topology, config)

  stream.setUncaughtExceptionHandler((thread, throwable) => logger.debug("This is very convenient ;-)"))

  stream.start()

  stream.close()
}
