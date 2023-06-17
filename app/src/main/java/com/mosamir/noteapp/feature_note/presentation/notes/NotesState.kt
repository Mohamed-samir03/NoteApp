package com.mosamir.noteapp.feature_note.presentation.notes

import com.mosamir.noteapp.feature_note.domain.model.Note
import com.mosamir.noteapp.feature_note.domain.util.NoteOrder
import com.mosamir.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
