package com.raids.ds.core.graph

import java.util.NoSuchElementException

import com.raids.ds.core.graph.edge.DirectedEdge

import scala.collection.mutable

class DirectedGraph[T] extends Graph[T] {
  override val vertices:mutable.Set[Vertex[T]] = mutable.Set[Vertex[T]]()

  private val adjList:mutable.Map[
    Vertex[T], mutable.Set[DirectedEdge[T]]] = mutable.Map[Vertex[T], mutable.Set[DirectedEdge[T]]
    ]()

  protected val vertexInDegree:mutable.Map[Vertex[T], Int] = mutable.Map[Vertex[T], Int]()

  override def addVertex(vertex: Vertex[T]): Unit = {
    if (!vertices.contains(vertex)) {
      vertices += vertex
    }
  }

  @throws(classOf[NoSuchElementException])
  override def inDegree(vertex: Vertex[T]): Int = {
    vertexInDegree.getOrElse(vertex, -1) match {
      case -1 => throw new NoSuchElementException(s"$vertex not found in the graph")
      case x: Int => x
    }
  }

  @throws(classOf[NoSuchElementException])
  override def outDegree(vertex: Vertex[T]): Int = {
    adjList.getOrElse(vertex, -1) match {
      case -1 => throw new NoSuchElementException(s"$vertex not found in the graph")
      case x: mutable.Set[DirectedEdge[T]] @unchecked => x.size
    }
  }

  def addEdge(edge: DirectedEdge[T]): Unit = {
    if (!vertices.contains(edge.vertex1))
      vertices += edge.vertex1

    if (!vertices.contains(edge.vertex2)) {
      vertices += edge.vertex2
      vertexInDegree.getOrElse(edge.vertex2, 0) match {
        case 0 => vertexInDegree.put(edge.vertex2, 0)
        case x: Int => vertexInDegree.update(edge.vertex2, x + 1)
      }
    }

    val neighbor: mutable.Set[DirectedEdge[T]] = adjList.getOrElse(edge.vertex1, mutable.Set[DirectedEdge[T]]())
    neighbor += edge
    adjList.put(edge.vertex1, neighbor)
  }

  override def contains(vertex: Vertex[T]):Boolean = vertices.contains(vertex)
}