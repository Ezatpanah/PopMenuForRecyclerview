package com.ezatpanah.contextmenuforrecyclerview

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.View


class ContextMenuRecyclerView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RecyclerView(context, attrs) {

    private var mContextMenuInfo: RecyclerViewContextMenuInfo? = null

    override fun getContextMenuInfo(): ContextMenuInfo? {
        return mContextMenuInfo
    }

    override fun showContextMenuForChild(originalView: View?): Boolean {
        val longPressPosition = getChildPosition(originalView!!)
        if (longPressPosition >= 0) {
            val longPressId = adapter!!.getItemId(longPressPosition)
            mContextMenuInfo = RecyclerViewContextMenuInfo(longPressPosition, longPressId)
            return super.showContextMenuForChild(originalView)
        }
        return false
    }

    class RecyclerViewContextMenuInfo(val position: Int, val id: Long) :
        ContextMenuInfo
}