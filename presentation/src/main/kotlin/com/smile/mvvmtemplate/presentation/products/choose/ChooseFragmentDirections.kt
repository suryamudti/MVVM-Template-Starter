package com.smile.mvvmtemplate.presentation.products.choose

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.smile.mvvmtemplate.R
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

//public class ChooseFragmentDirections private constructor() {
//  private data class NavigateToProductsListFragment(
//    public val choosePathType: ChoosePathType = ChoosePathType.RX
//  ) : NavDirections {
//    public override fun getActionId(): Int = R.id.navigateToProductsListFragment
//
//    @Suppress("CAST_NEVER_SUCCEEDS")
//    public override fun getArguments(): Bundle {
//      val result = Bundle()
//      if (Parcelable::class.java.isAssignableFrom(ChoosePathType::class.java)) {
//        result.putParcelable("choosePathType", this.choosePathType as Parcelable)
//      } else if (Serializable::class.java.isAssignableFrom(ChoosePathType::class.java)) {
//        result.putSerializable("choosePathType", this.choosePathType as Serializable)
//      }
//      return result
//    }
//  }
//
//  public companion object {
//    public fun navigateToProductsListFragment(choosePathType: ChoosePathType = ChoosePathType.RX):
//        NavDirections = NavigateToProductsListFragment(choosePathType)
//  }
//}
