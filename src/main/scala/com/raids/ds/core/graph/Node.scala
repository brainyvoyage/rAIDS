package com.raids.ds.core.graph

object NodeState extends Enumeration{
  type NodeState = Value
  val Visited, Undiscovered, Discovered = Value
}

class Node[T](value: T, source: Boolean) {
  private var state = NodeState.Undiscovered
  val isSource = source
  val nodeValue = value

  override def toString: String = nodeValue.toString

  def getState:NodeState.NodeState = state

  def setState(state: NodeState.NodeState): Unit = this.state = state
}
