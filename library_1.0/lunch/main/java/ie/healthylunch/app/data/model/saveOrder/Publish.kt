package ie.healthylunch.app.data.model.saveOrder

import com.google.gson.annotations.SerializedName

data class Publish(@SerializedName("developer")
                   val developer: String = "",
                   @SerializedName("version")
                   val version: String = "")