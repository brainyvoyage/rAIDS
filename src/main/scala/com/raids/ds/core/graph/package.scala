package com.raids.ds.core

package object graph {
  trait States extends Enumeration {
    val visited: Value = Value("VISITED")
    val discovered: Value = Value("DISCOVERED")
    val unDiscovered: Value = Value("UNDISCOVERED")
  }

}
