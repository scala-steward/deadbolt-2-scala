package be.objectify.deadbolt.scala.test.controllers

import be.objectify.deadbolt.scala.test.dao.{SubjectDao, TestSubjectDao}
import be.objectify.deadbolt.scala.test.modules.CustomDeadboltHook
import play.api.inject._
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.libs.ws.{WSAPI, WSClient}
import play.api.test.PlaySpecification
import play.api.{Application, Mode}

abstract class AbstractControllerSpec extends PlaySpecification {
  sequential
  isolated

  def testApp: Application = new GuiceApplicationBuilder()
                             .in(Mode.Test)
                             .bindings(bind[SubjectDao].to[TestSubjectDao])
                             .build()

  def ws(app: Application): WSClient = app.injector.instanceOf[WSClient]
}
