package operation

import io.gatling.core.Predef._

import scala.concurrent.duration._
import com.intuit.karate.gatling.PreDef._

import scala.language.postfixOps



class TestSimulation extends Simulation {
  System.out.println()
  val getUser = scenario("Test get request").exec(karateFeature( System.getProperty("user.dir")+"\\src\\test\\java\\operation\\testPT.feature"))

  setUp(

    getUser.inject(rampUsers(users = 3) during (10 seconds))

  )
}
