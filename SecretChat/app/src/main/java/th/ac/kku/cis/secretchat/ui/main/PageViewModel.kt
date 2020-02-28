package th.ac.kku.cis.secretchat.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        if(it == 1){
            "Hello world"
         }
        else{
            "Hello world from section: $it"
        }

    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}