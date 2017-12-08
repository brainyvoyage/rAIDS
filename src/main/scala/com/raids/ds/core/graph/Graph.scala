package com.raids.ds.core.graph

import scala.collection.mutable

class Graph[T](directed:Boolean) {
  private val nodes = collection.mutable.Set[T]()
  private val edges = collection.mutable.Map[T, collection.mutable.Set[T]]()

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

  def isEmpty(): Boolean = nodes.isEmpty

  override def toString = s"Graph\nDirected: $isDirected,\n" +
    s"Number of nodes: $getNumberOfNodes,\n" +
    s"Nodes: $nodes,\n" +
    s"Edges: $edges"
}

object Graph extends App {
  val graph = new Graph[Int](directed = false)
  graph.addEdge(2, 4)
  graph.addEdge(2, 6)
  graph.addEdge(2, 8)
  graph.addEdge(2, 10)
  graph.addEdge(3, 6)
  graph.addEdge(3, 9)

  println(graph)
}
