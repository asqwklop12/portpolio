package com.younghun.klom.insertBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	static Connection conn = null;
	static PreparedStatement pstmt = null;

	public static void main(String[] args) throws Exception {

		long bookcd = 100891277;

		for (long book = bookcd; book < bookcd + 10; book++) {

			String url = "http://www.ypbooks.co.kr/book.yp?bookcd=" + String.valueOf(book);

			Document doc = Jsoup.connect(url).post().normalise();

			Element element2 = doc.selectFirst("img#book_img");

			Elements elements = doc.select("table[style] tbody tr td + :not(td:has(strong))");

			List<String> list = new ArrayList<String>();
			for (Element e : elements) {
				list.add(e.text());
			}

			Element splitItem = doc.selectFirst("dd.mT10 h1");
			String[] split = splitItem.text().split(" | ", 10);
			int page = Integer.parseInt(split[2].substring(0, split[2].indexOf('p')).replace(",", ""));

			Element element3 = doc.selectFirst("strong.price02");

			Elements elements2 = doc.select(".bookInfo .tabcon");
			List<String> list2 = new ArrayList<String>();

			try {
				for (int i = 0; i < elements2.size(); i++) {
					list2.add(elements2.get(i).html());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			String driver = "com.mysql.cj.jdbc.Driver";
			String url1 = "jdbc:mysql://localhost:3306/portpolio?serverTimezone=UTC";
			String sql = "INSERT INTO BookbasicInfo (bookPicture,bookTitle,bookAuthor,bookpublisher,bookISBN,bookPage,bookDate,bookPrice)"
					+ "VALUES (?,?,?,?,?,?,?,?)"
					+ "ON DUPLICATE KEY UPDATE bookPicture=?,BookTitle=?,BookAuthor=?,BookPublisher=?,BookISBN=?,BookPage=?,BookDate=?,BookPrice=?";

			try {

				Class.forName(driver);
				conn = DriverManager.getConnection(url1);
				pstmt = conn.prepareStatement(sql);

				pstmt.setString(1, element2.attr("src"));
				System.out.println("이미지: " + element2.attr("src"));
				pstmt.setString(2, list.get(1));
				System.out.println("제목: " + list.get(1));

				pstmt.setString(3, list.get(2));
				System.out.println("저자" + list.get(2));

				pstmt.setString(4, list.get(3));
				System.out.println("출판사" + list.get(3));

				pstmt.setLong(5, Long.parseLong(list.get(0)));
				System.out.println("ISBN" + Long.parseLong(list.get(0)));

				pstmt.setInt(6, page);
				System.out.println("페이지:" + page);

				pstmt.setString(7, list.get(4));
				System.out.println("날짜:" + list.get(4));

				pstmt.setString(8, element3.text());
				System.out.println("가격: " + element3.text());

				pstmt.setString(9, element2.attr("src"));
				pstmt.setString(10, list.get(1));
				pstmt.setString(11, list.get(2));
				pstmt.setString(12, list.get(3));
				pstmt.setLong(13, Long.parseLong(list.get(0)));
				pstmt.setInt(14, page);
				pstmt.setString(15, list.get(4));
				pstmt.setString(16, element3.text());

				int r = pstmt.executeUpdate();
				System.out.println("변경된 row : " + r);
			} catch (SQLException e) {
				System.out.println("연결 오류" + e.getStackTrace());
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("로드 오류" + e.getStackTrace());
			} finally {

				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				if (conn != null) {
					try {
						conn.close();

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			String sql2 = "insert into bookdetailinfo (bookTitle,bookSummary,bookIndex) " + "VALUES (?,?,?)"
					+ "ON DUPLICATE KEY UPDATE bookTitle=?,bookSummary=?,bookIndex=?";

			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url1);
				pstmt = conn.prepareStatement(sql2);

				try {

					pstmt.setString(1, list.get(1));
					System.out.println("제목2: " + list.get(1));
					pstmt.setString(2, list2.get(1));
					System.out.println("책소개: " + list2.get(1));
					pstmt.setString(3, list2.get(2));
					System.out.println("목차: " + list2.get(2));

					pstmt.setString(4, list.get(1));

					pstmt.setString(5, list2.get(1));
					pstmt.setString(6, list2.get(2));

					int r = pstmt.executeUpdate();
					System.out.println("변경된 row : " + r);
				} catch (Exception e) {
					// TODO: handle exception
				}

			} catch (SQLException e) {
				System.out.println("연결 오류" + e.getStackTrace());
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("로드 오류" + e.getStackTrace());
			} finally {

				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				if (conn != null) {
					try {
						conn.close();

					} catch (SQLException e) {
						System.out.println("닫기 오류" + e.getStackTrace());
					}

				}

				System.out.println("다음책 +++++++++++++++++++++++++++++++++++++++++");
			}

		}
	}
}
