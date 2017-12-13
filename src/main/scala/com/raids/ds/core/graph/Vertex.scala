package com.raids.ds.core.graph

<<<<<<< HEAD
trait States extends Enumeration {
  val visited: Value = Value("VISITED")
  val discovered: Value = Value("DISCOVERED")
  val unDiscovered: Value = Value("UNDISCOVERED")
}


class Vertex[T](var data:T) extends States{
  private[this] var _state:Value = unDiscovered
  private[this] var _discoveryTime:Int = 0
  private[this] var _finishingTime:Int = -1
  private[this] var _predecessor:Vertex[T] = this  // ToDo: Figure out better way

  def state: Value = _state
  def state_= (value: Value): Unit = _state = value

  def discoveryTime:Int = _discoveryTime
  def discoveryTime_=(value: Int): Unit = _discoveryTime = value

  def finishingTime:Int = _finishingTime
  def finishingTime_=(value: Int): Unit = {
    require(value >= _discoveryTime)
    _finishingTime = value
  }

  def predecessor:Vertex[T] = _predecessor
  def predecessor_=(predecessor: Vertex[T]): Unit = _predecessor = predecessor
}