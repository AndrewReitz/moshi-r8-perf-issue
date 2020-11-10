package cash.andrew.moshi.models

import com.squareup.moshi.JsonClass
import kotlin.Int
import kotlin.String

@JsonClass(generateAdapter = true)
public data class TestClass240(
  public val a: String,
  public val b: Int
)
