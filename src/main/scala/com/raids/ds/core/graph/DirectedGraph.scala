package com.raids.ds.core.graph

import java.util.NoSuchElementException

import com.raids.ds.core.graph.edge.DirectedEdge

import scala.language.higherKinds
import scala.collection.mutable

class DirectedGraph[A[B]] extends Graph[A]{
  private val adjList:mutable.Map[
    Vertex[A[_]], mutable.Set[DirectedEdge[A[_]]]] = mutable.Map[Vertex[A[_]], mutable.Set[DirectedEdge[A[_]]]
    ]()
  protected val vertexInDegree:mutable.Map[Vertex[A[_]], Int] = mutable.Map[Vertex[A[_]], Int]()
  override val vertices: mutable.Set[Vertex[A[_]]] = mutable.Set[Vertex[A[_]]]()

  override def addVertex(vertex: Vertex[A[_]]): Unit = {
    if (!vertices.contains(vertex)) {
      vertices += vertex
    }
  }

  override def inDegree(vertex: Vertex[A[_]]): Int = {
    vertexInDegree.getOrElse(vertex, -1) match {
      case -1 => throw new NoSuchElementException(s"$vertex not found in the graph")
      case x: Int => x
    }
  }

  override def outDegree(vertex: Vertex[A[_]]): Int = {
    adjList.getOrElse(vertex, -1) match {
      case -1 => throw new NoSuchElementException(s"$vertex not found in the graph")
      case x: mutable.Set[DirectedEdge[A[_]]] @unchecked => x.size
    }
  }

  override def contains(vertex: Vertex[A[_]]): Boolean = vertices.contains(vertex)
}
/*
override val vertices:mutable.Set[Vertex[A[_]]] = mutable.Set[Vertex[A[_]]]()

  private val adjList:mutable.Map[
    Vertex[A[_]], mutable.Set[DirectedEdge[A[_]]]] = mutable.Map[Vertex[A[_]], mutable.Set[DirectedEdge[A[_]]]
    ]()

  protected val vertexInDegree:mutable.Map[Vertex[A[_]], Int] = mutable.Map[Vertex[A[_]], Int]()

  override def addVertex(vertex: Vertex[A[_]]): Unit = {
    if (!vertices.contains(vertex)) {
      vertices += vertex
    }
  }

  @throws(classOf[NoSuchElementException])
  override def inDegree(vertex: Vertex[A[_]]): Int = {
    vertexInDegree.getOrElse(vertex, -1) match {
      case -1 => throw new NoSuchElementException(s"$vertex not found in the graph")
      case x: Int => x
    }
  }

  @throws(classOf[NoSuchElementException])
  override def outDegree(vertex: Vertex[A[_]]): Int = {
    adjList.getOrElse(vertex, -1) match {
      case -1 => throw new NoSuchElementException(s"$vertex not found in the graph")
      case x: mutable.Set[DirectedEdge[T]] @unchecked => x.size
    }
  }

  def addEdge(edge: DirectedEdge[A[_]]): Unit = {
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

  def contains(vertex: Vertex[A[_]]):Boolean = vertices.contains(vertex)
 */