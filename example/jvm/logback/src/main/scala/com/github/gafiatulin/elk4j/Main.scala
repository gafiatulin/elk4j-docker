package com.github.gafiatulin.elk4j

/**
  * Created by Victor on 30/04/16.
  */

import org.slf4j.LoggerFactory

import scala.util.{Failure, Success, Try}

object Main extends App{
  def log = LoggerFactory.getLogger(this.getClass)
  Stream from 0 foreach { i =>
    log.info(s"Starting iteration #$i")
    log.debug(s"Debug message #$i")
    log.warn(s"About to perform division by zero")
    Try( i / 0 ) match{
      case Failure(t) => log.error(s"Error message #$i", t)
      case Success(x) => log.error(s"This is impossible")
    }
    Thread sleep 1000
  }

}
