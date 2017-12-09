package com.raids.ds.core.graph

object EdgeDirection extends Enumeration{
  val Directed, Undirected, Bidirectional = Value
}

trait Unweighted {
  val _weight:Float = 1.0f
  def weight: Float = _weight
  val dash: String = new String(Array[Byte](0xE2.toByte, 0x80.toByte, 0x95.toByte))
  override def toString: String = dash
}

trait Weighted {
  private var _weight: Float = 0.0f
  def * (multiplier: Float): Unit = _weight *= multiplier
  def + (increment: Float): Unit = _weight += increment
  def weight: Float = _weight
  def weight_= (value: Float): Unit = _weight = value

  override def toString: String = new String(Array[Byte](0xE2.toByte, 0x94.toByte, 0x81.toByte))
}

trait UnDirected {
  override def toString: String = ""
}

trait Directed extends UnDirected{
  override def toString: String = new String(Array[Byte](0xE2.toByte, 0xAE.toByte, 0x9E.toByte))
}

abstract class Edge[T](n1: Node[T], n2: Node[T]) {
  val node1:Node[T] = n1
  val node2: Node[T] = n2
}

class DirectedWeightedEdge[T](from: Node[T], to: Node[T]) extends Edge(from, to) with Directed with Weighted{
  override def toString: String = node1.toString +
    super[Directed].toString +
    super[Weighted].toString +
    node2.toString
}

class DirectedUnWeightedEdge[T](from: Node[T], to: Node[T]) extends Edge(from, to) with Directed with Unweighted{
  override def toString: String = node1.toString +
    super[Directed].toString +
    super[Unweighted].toString +
    node2.toString
}

class UnDirectedWeightedEdge[T](n1: Node[T], n2: Node[T]) extends Edge(n1, n2) with UnDirected with Weighted{
  override def toString: String = node1.toString +
    super[UnDirected].toString +
    super[Weighted].toString +
    node2.toString
}

class UnDirectedUnweightedEdge[T](n1: Node[T], n2: Node[T]) extends Edge(n1, n2) with UnDirected with Unweighted{
  override def toString: String = node1.toString +
    super[UnDirected].toString +
    super[Unweighted].toString +
    node2.toString

}