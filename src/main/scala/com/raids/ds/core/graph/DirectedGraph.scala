package com.raids.ds.core.graph

import com.raids.ds.core.graph.edge.{DirectedEdge, Edge}

import scala.collection.mutable

class DirectedGraph[T] extends Graph[T] {
  private[this] val vertices:mutable.Set[Vertex[T]] = mutable.Set[Vertex[T]]()

  private[this] val adjList:mutable.Map[
    Vertex[T], mutable.Set[DirectedEdge[T]]] = mutable.Map[
    Vertex[T], mutable.Set[DirectedEdge[T]]
    ]()

  override def addVertex(vertex: Vertex[T]): Unit = {}

  override def inDegree(vertex: Vertex[T]): Unit = {}

  override def outDegree(vertex: Vertex[T]): Unit = {}

  def addEdge(edge: DirectedEdge[Vertex[T]]): Unit = {
    if (!vertices.contains(edge.vertex1))
      vertices += edge.vertex1

    if (!vertices.contains(edge.vertex2))
      vertices += edge.vertex2

    adjList.get(edge.vertex1)
  }
}