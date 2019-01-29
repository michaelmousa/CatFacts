package com.treehouse.CatFacts.ui.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.treehouse.CatFacts.model.ArrResponse
import com.treehouse.randomjoke.R

class RanAdapter : RecyclerView.Adapter<RanAdapter.RanViewHolder>() {


    private val data = arrayListOf<ArrResponse>()
    fun setData(data: List<ArrResponse>) {

        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RanViewHolder {

        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, false)
        return RanViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(viewHolder: RanViewHolder, position: Int)
    {
        viewHolder.bind(data[position])
    }

    class RanViewHolder(private val rootView: View) : RecyclerView.ViewHolder(rootView) {

        fun bind(data: ArrResponse) {

            val tvI_id =rootView.findViewById<TextView>(R.id.tvI_id)
            tvI_id.text= data._id

            val tvV_V =rootView.findViewById<TextView>(R.id.tvV_V)
            tvV_V.text= data.__v

            val tvText1 =rootView.findViewById<TextView>(R.id.tvText1)
            tvText1.text= data.text

            val tvUpdatedAt =rootView.findViewById<TextView>(R.id.tvUpdatedAt)
            tvUpdatedAt.text= data.updatedAt

            val tvCreatedAt =rootView.findViewById<TextView>(R.id.tvCreatedAt)
            tvCreatedAt.text= data.source




            /*val tvIcon_url =rootView.findViewById<TextView>(R.id.tvIcon_url)
            tvIcon_url.text= data.icon_url

            val tvId =rootView.findViewById<TextView>(R.id.tvId)
            tvId.text= data.id

            val tvUrl =rootView.findViewById<TextView>(R.id.tvUrl)
            tvUrl.text= data.url

            val tvValue =rootView.findViewById<TextView>(R.id.tvValue)
            tvValue.text= data.value*/


        }
    }
}