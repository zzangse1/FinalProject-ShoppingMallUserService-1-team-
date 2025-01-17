package com.example.frume.util

enum class UserInfoType(var number: Int, var str: String) {
    // 주문 내역 및 배송조회
    USER_ORDER_HISTORY_FRAGMENT(0, "주문 내역 및 배송조회"),

    // 주문 상세 내역
    USER_ORDER_DETAIL_FRAGMENT(1, "주문 상세 내역"),

    // 주문 반품 및 취소
    USER_CANCEL_AND_RETURN_FRAGMENT(2, "주문 반품 및 취소"),

    // 회원 정보 관리 및 탈퇴
    USER_INFO_MANAGE_FRAGMENT(3, "회원 정보 관리 및 탈퇴"),

    // 회원 정보 수정
    USER_INFO_MODIFY_FRAGMENT(4, "회원 정보 수정"),

    // 배송지 관리
    USER_ADDRESS_MANAGE_FRAGMENT(5, "배송지 관리")
}

enum class ProductInfoType(var number: Int, var str: String) {
    // 상품 (tabLayout을 갖고있는 화면)
    USER_PRODUCT_INFO_TYPE(0, "UserProductInfoFragment"),

    // 상품 설명
    USER_PRODUCT_INFO_DESCRIPTION_TYPE(1, "UserProductInfoDescription"),

    // 상품 상세 정보
    USER_PRODUCT_INFO_DETAIL_TYPE(2, "UserProductInfoDetailFragment"),

    // 상품 후기
    USER_PRODUCT_INFO_REVIEW_TYPE(3, "UserProductInfoReviewFragment"),

    // 상품 후기 작성
    USER_PRODUCT_INFO_WRITE_TYPE(4, "UserProductWriteReviewFragment"),

    // 상품 주문 다이얼로그
    USER_PRODUCT_INFO_DIALOG_TYPE(5, "UserProductInfoDialogFragment"),

    // 상품 리스트 뷰
    USER_PRODUCT_SHOW_LIST_TYPE(6, "userProductShowListFragment"),
    // 구매 뷰


    // sehoon 홈 -> 서치 테스트
    //HOME_USER_MAIN(7, "홈"),
    HOME_SEARCH_VIEW(7, "userHomeSearchFragment"),

}


// 홈 화면 탭 레이아웃 분류
enum class CategoryType(val number: Int, val category: String) {
    CATEGORY_HOME_MAIN(0, "홈"),
    CATEGORY_HOME_NEW(1, "신제품"),
    CATEGORY_HOME_SALE(2, "특가"),
    CATEGORY_HOME_BEST(3, "베스트"),
    CATEGORY_HOME_SINGLE(4, "1인가구"),
    CATEGORY_HOME_PACKAGE(5, "패키지")
}