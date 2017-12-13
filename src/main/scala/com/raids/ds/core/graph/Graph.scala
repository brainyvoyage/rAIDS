package com.raids.ds.core.graph


abstract class Graph[T]{
  val vertices:collection.mutable.Set[Vertex[T]]
  def addVertex(vertex: Vertex[T]):Unit
  def inDegree(vertex: Vertex[T]):Int
  def outDegree(vertex: Vertex[T]):Int
  def contains(vertex: Vertex[T]):Boolean
}
