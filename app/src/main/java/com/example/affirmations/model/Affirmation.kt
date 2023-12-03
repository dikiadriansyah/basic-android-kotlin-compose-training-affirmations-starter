package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Membuat class data untuk Affirmation
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int)
/*
anotasikan properti stringResourceId dengan anotasi @StringRes.
stringResourceId mewakili ID untuk teks afirmasi yang disimpan di resource string.
 */



