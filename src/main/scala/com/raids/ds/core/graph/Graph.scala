package com.raids.ds.core.graph

abstract class Graph[V, E](directed:Boolean) {
  private val nodes = collection.mutable.Set[V]()
  private val edges = collection.mutable.Map[V, collection.mutable.Set[E]]()
}
  /*
  private def addEdgeHelper(from:T, to:T): Unit = {
    val adjacencyList = edges.getOrElse(from, mutable.Set[T]{to})
    if (!adjacencyList.contains(to))
      adjacencyList += to
    edges.put(from, adjacencyList)
  }

  val isDirected:Boolean = directed

  def addNode(node:T): Unit ={
    nodes += node
  }

  def addEdge(from:T, to:T): Unit = {
    if (!nodes.contains(from))
      nodes += from
    if (!nodes.contains(to))
      nodes += to
    this.addEdgeHelper(from, to)

    if(!this.isDirected)
      this.addEdgeHelper(to, from)
  }

  def getNumberOfNodes: Int = nodes.size

  def printNodes(): Unit = {
    nodes.toString()
  }

  def printGraph(): Unit = {
    edges.foreach(println)
  }

  def isEmpty: Boolean = nodes.isEmpty

  override def toString = s"Graph\nDirected: $isDirected,\n" +
    s"Number of nodes: $getNumberOfNodes,\n" +
    s"Nodes: $nodes,\n" +
    s"Edges: $edges"

  def transpose():Graph[T]
  def complement(): Graph[T]
  def lineGraph(): Graph[T]
  def mirror(): Graph[T]
  def powerGraph(): Graph[T]
  def dualGraph(): Graph[T]
  def medialGraph(): Graph[T]
  def quotientGraph(): Graph[T]

}
*/