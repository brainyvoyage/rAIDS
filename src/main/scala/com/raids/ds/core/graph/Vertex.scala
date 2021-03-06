package com.raids.ds.core.graph

class Vertex[T](val data:T) extends States {
  private[this] var _state:Value = unDiscovered
  private[this] var _discoveryTime:Int = 0
  private[this] var _finishingTime:Int = -1
  private[this] var _predecessor:Vertex[T] = this  // ToDo: Figure out better way

  def state: Value = _state
  def state_= (value: Value): Unit = _state = value

  def discoveryTime:Int = _discoveryTime
  def discoveryTime_=(value: Int): Unit = _discoveryTime = value

  def finishingTime:Int = _finishingTime
  @throws(classOf[IllegalArgumentException])
  def finishingTime_=(value: Int): Unit = {
    require(value >= _discoveryTime)
    _finishingTime = value
  }

  def predecessor:Vertex[T] = _predecessor
  @throws(classOf[IllegalArgumentException])
  def predecessor_=(that: Vertex[T]): Unit = {
    require(that.discoveryTime < this._predecessor.discoveryTime)
    _predecessor = that
  }
}