import chisel3._
import chisel3.util._

trait Constant {
  val ALU_X     = "??_????_????"
  val ALU_ADD   = "00_0000_0001"
  val ALU_SUB   = "00_0000_0010"
  val ALU_SLT   = "00_0000_0100"
  val ALU_SLTU  = "00_0000_1000"
  val ALU_XOR   = "00_0001_0000"
  val ALU_OR    = "00_0010_0000"
  val ALU_AND   = "00_0100_0000"
  val ALU_SLL   = "00_1000_0000"
  val ALU_SRL   = "01_0000_0000"
  val ALU_SRA   = "10_0000_0000"

  val SIZE_B  = "b00".U
  val SIZE_H  = "b01".U
  val SIZE_W  = "b10".U
  val SIZE_D  = "b11".U

  val SYS_X      = "????"
  val SYS_CSRRW  = "0001"
  val SYS_CSRRS  = "0010"
  val SYS_CSRRC  = "0011"
  val SYS_CSRRSI = "1000"
  val SYS_CSRRCI = "1001"
  val SYS_ECALL  = "0100"
  val SYS_MRET   = "0101"
  val SYS_FENCE  = "0110"
  val SYS_INT    = "0111"

  val LOAD_X   = "???????"
  val LOAD_LB  = "0000001"
  val LOAD_LBU = "0000010"
  val LOAD_LH  = "0000100"
  val LOAD_LHU = "0001000"
  val LOAD_LW  = "0010000"
  val LOAD_LWU = "0100000"
  val LOAD_LD  = "1000000"

  val STORE_X   = "????"
  val STORE_SB  = "0001"
  val STORE_SH  = "0010"
  val STORE_SW  = "0100"
  val STORE_SD  = "1000"

  val TYPE_X    = "??????"
  val TYPE_U    = "100000"
  val TYPE_I    = "010000"
  val TYPE_R    = "001000"
  val TYPE_S    = "000100"
  val TYPE_J    = "000010"
  val TYPE_B    = "000001"

  val REDIRECT_X      = "???????????"
  val REDIRECT_BEQ    = "10000000000"
  val REDIRECT_BNE    = "01000000000"
  val REDIRECT_BLT    = "00100000000"
  val REDIRECT_BGE    = "00010000000"
  val REDIRECT_BLTU   = "00001000000"
  val REDIRECT_BGEU   = "00000100000"
  val REDIRECT_JAL    = "00000010000"
  val REDIRECT_JALR   = "00000001000"
  val REDIRECT_ECALL  = "00000000100"
  val REDIRECT_MRET   = "00000000010"
  val REDIRECT_INT    = "00000000001"

  val REQ_READ  = 0.U
  val REQ_WRITE = 1.U

  val RW_DATA_WIDTH = 128

  val CLINT_MTIMECMP  = "h0000000002004000".U
  val CLINT_MTIME     = "h000000000200bff8".U

  val EnableDifftest  = true.B
  val EnableCSR       = true.B
  val EnableIcache    = true.B
  val EnableDcache    = true.B
}

object Csrs {
  val mhartid  = "hf14".U
  val mstatus  = "h300".U
  val mie      = "h304".U
  val mtvec    = "h305".U
  val mscratch = "h340".U
  val mepc     = "h341".U
  val mcause   = "h342".U
  val mip      = "h344".U
  val mcycle   = "hb00".U
  val minstret = "hb02".U
}

object Constant extends Constant { }
