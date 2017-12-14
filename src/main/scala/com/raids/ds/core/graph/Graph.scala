package com.raids.ds.core.graph
import scala.language.higherKinds

abstract class Graph[A[B]]{
  val vertices:collection.mutable.Set[Vertex[A[_]]]
  def addVertex(vertex: Vertex[A[_]]):Unit
  def inDegree(vertex: Vertex[A[_]]):Int
  def outDegree(vertex: Vertex[A[_]]):Int
  def contains(vertex: Vertex[A[_]]):Boolean
}
