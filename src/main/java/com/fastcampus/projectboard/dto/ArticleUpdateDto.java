package com.fastcampus.projectboard.dto;

public record ArticleUpdateDto(
        String title,
        String content,
        String hashTag
) {
  public static ArticleUpdateDto of(String title, String content, String hashTag) {
      return new ArticleUpdateDto(title, content, hashTag);
  }
}
