package com.krisdrum

import java.util.concurrent.TimeUnit

import com.typesafe.scalalogging.LazyLogging
import org.apache.commons.lang.exception.ExceptionUtils
import org.apache.kafka.streams.{KafkaStreams, StreamsBuilder, StreamsConfig, Topology}

object Test  extends App with Config with LazyLogging {
  val builder: StreamsBuilder = ???
  val topology: Topology = ???
  val config: StreamsConfig = ???

  val stream: KafkaStreams = new KafkaStreams(topology, config)

  stream.setUncaughtExceptionHandler((thread, throwable) =>
    logger.error("Stream terminated because of uncaught exception.", ExceptionUtils.getRootCause(throwable)))

  stream.start()

  sys.addShutdownHook {
    stream.close(10, TimeUnit.SECONDS)
    logger.info("Shutting down streams.")
  }
}
