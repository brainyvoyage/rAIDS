package com.raids.ds.core.graph

import org.scalatest.{FlatSpec, Matchers}

class VertexTest extends FlatSpec with Matchers {
  val stringVertex:Vertex[String] = new Vertex[String]("Initial Value")
  val intVertex:Vertex[Int] = new Vertex[Int](3)
  val floatVertex:Vertex[Float] = new Vertex[Float](3.14f)
  val predecessor:Vertex[String] = new Vertex[String]("predecessor")

  "A vertex instantiated with String type" should "have data type of string" in {
    stringVertex.data.isInstanceOf[String] should be (true)
  }
  it should "have value equals to the initial passed value" in {
    stringVertex.data should be ("Initial Value")
    intVertex.data should be (3)
    floatVertex.data should be (3.14f)
  }
  it should "have be in an un-discovered state" in {
    stringVertex.state should be (stringVertex.unDiscovered)
    intVertex.state should be (intVertex.unDiscovered)
    floatVertex.state should not be (intVertex.unDiscovered)
  }
  it should "be able to change state" in {
    stringVertex.state = stringVertex.discovered
    stringVertex.state should be (stringVertex.discovered)
  }
  it should "have initial discovery time of 0 and finishing time of -1" in {
    intVertex.discoveryTime should be (0)
    floatVertex.finishingTime should be(-1)
  }
  it should "be able to change discovery and finishing time" in {
    intVertex.discoveryTime = 4
    intVertex.discoveryTime should be (4)

    intVertex.finishingTime = 9
    intVertex.finishingTime should be (9)
  }
  it should "not allow finishing time lower than discovery time" in {
    an [IllegalArgumentException] should be thrownBy {
      intVertex.finishingTime = 3
    }
  }
  it should "be its on predecessor (initially) " in {
    floatVertex.predecessor should be (floatVertex)
    stringVertex.predecessor should be (stringVertex)
  }
  it should "not allow to add predecessor with discovery time higher than its own " in {
    an[IllegalArgumentException] should be thrownBy {
      stringVertex.predecessor = predecessor
    }
  }
  it should "allow to add proper predecessor with correct discovery time" in {
    stringVertex.discoveryTime = 3
    predecessor.discoveryTime = 2
    stringVertex.predecessor = predecessor
    stringVertex.predecessor should be (predecessor)
  }
}
