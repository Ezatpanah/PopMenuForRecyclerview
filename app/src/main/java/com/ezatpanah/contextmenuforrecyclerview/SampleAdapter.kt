package com.ezatpanah.recyclerviewanimations

import android.graphics.Insets.add
import android.util.Log
import android.view.*
import android.view.animation.*
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.core.graphics.Insets.add
import androidx.core.view.OneShotPreDrawListener.add
import androidx.recyclerview.widget.RecyclerView
import com.ezatpanah.contextmenuforrecyclerview.R
import com.ezatpanah.contextmenuforrecyclerview.SampleModel


class SampleAdapter(private val items: MutableList<SampleModel>) :
    RecyclerView.Adapter<SampleAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_row, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position]) // Set the view to fade in

    }

    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener,
        PopupMenu.OnMenuItemClickListener {
        var mPosition = 0

        private val tvId = itemView.findViewById<TextView>(R.id.tvId)
        private val tvName = itemView.findViewById<TextView>(R.id.tvName)
        private val imgMore = itemView.findViewById<ImageView>(R.id.imgMore)

        fun bind(item: SampleModel) {
            tvId.text = item.id.toString()
            tvName.text = item.name
            imgMore.setOnClickListener(this)

        }

        override fun onClick(p0: View) {
            Log.d("Tag", "Onclick : $adapterPosition")
            showPopMenu(p0)
        }

        private fun showPopMenu(view: View) {
            val popupMenu = PopupMenu(view.context, view)
            popupMenu.inflate(R.menu.menu_demo_context)
            popupMenu.setOnMenuItemClickListener(this)
            popupMenu.show();
        }

        override fun onMenuItemClick(item: MenuItem): Boolean {
            return when (item.itemId) {
                R.id.menuEdit -> {
                    Log.d("Tag", "onMenuItemClick: menuEdit ")
                    true
                }
                R.id.menuDelete -> {
                    Log.d("Tag", "onMenuItemClick: menuDelete ")
                    true
                }
                else -> false
            }
        }

    }

}
