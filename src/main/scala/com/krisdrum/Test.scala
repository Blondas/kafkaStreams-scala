package com.krisdrum

import org.apache.kafka.streams.{KafkaStreams, StreamsBuilder, StreamsConfig, Topology}

object Test  extends App{
  val builder: StreamsBuilder = ???
  val topology: Topology = ???
  val config: StreamsConfig = ???

  val stream: KafkaStreams = new KafkaStreams(topology, config)

  stream.start()
}