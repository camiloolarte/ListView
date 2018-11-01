package com.cristhian.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class MyAdapter(context:Context, list:Array<String>):BaseAdapter() {

    var list:Array<String>
    private val inflator:LayoutInflater

    init {
        this.inflator=LayoutInflater.from(context)
        this.list = list
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val view:View?
        val vh:ViewHolder

        if (convertView==null){

            view = this.inflator.inflate(R.layout.item,parent,false)
            vh=ViewHolder(view)
            view.tag = vh
        }else{
            view = convertView
            vh = view.tag as ViewHolder
        }
        vh.textitem.text = list[position]
        return view
    }

    override fun getItem(position: Int):Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

    private class ViewHolder (row:View?){
        public val textitem:TextView
        init {
            this.textitem=row?.findViewById(R.id.textitem) as TextView
        }
    }
}