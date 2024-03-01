package com.openlibrary.bookstore.model

data class NetworkLove(
    val key: String,
    val name: String,
    val subject_type: String,
    val work_count: Int,
    val works: List<Work>,
)

data class Work(
    val key: String,
    val title: String,
    val edition_count: Int,
    val cover_id: Long,
    val cover_edition_key: String,
    val subject: List<String>,
    val ia_collection: List<String>,
    val lendinglibrary: Boolean,
    val printdisabled: Boolean,
    val lending_edition: String,
    val lending_identifier: String,
    val authors: List<Author>,
    val first_publish_year: Int,
    val ia: String,
    val public_scan: Boolean,
    val has_fulltext: Boolean,
    val availability: Availability,
)

data class Author(
    val key: String,
    val name: String,
)

data class Availability(
    val status: String,
    val available_to_browse: Boolean,
    val available_to_borrow: Boolean,
    val available_to_waitlist: Boolean,
    val is_printdisabled: Boolean,
    val is_readable: Boolean,
    val is_lendable: Boolean,
    val is_previewable: Boolean,
    val identifier: String,
    val isbn: String,
    val oclc: Any?,
    val openlibrary_work: String,
    val openlibrary_edition: String,
    val last_loan_date: Any?,
    val num_waitlist: Any?,
    val last_waitlist_date: Any?,
    val is_restricted: Boolean,
    val is_browseable: Boolean,
    val __src__: String,
)

