package mesosphere.marathon.core.base

import akka.actor.{ ActorRefFactory, ActorSystem }
import akka.stream.ActorMaterializer
import org.slf4j.LoggerFactory

/**
  * Contains basic dependencies used throughout the application disregarding the concrete function.
  */
class ActorsModule(actorSystem: ActorSystem) {
  private[this] val log = LoggerFactory.getLogger(getClass)

  def actorRefFactory: ActorRefFactory = actorSystem
  val materializer = ActorMaterializer()(actorRefFactory)
}
