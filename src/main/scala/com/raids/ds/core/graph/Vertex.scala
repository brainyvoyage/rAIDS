package com.raids.ds.core.graph

import com.raids.Data

abstract class Vertex[T <: Data](val data: Data){
  object State extends Enumeration
  def compute()
}