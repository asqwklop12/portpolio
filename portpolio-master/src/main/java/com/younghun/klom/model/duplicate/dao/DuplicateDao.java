package com.younghun.klom.model.duplicate.dao;

import com.younghun.klom.model.duplicate.dto.DuplicateDto;

public interface DuplicateDao {
	int nameCheck(DuplicateDto duplicateDto);
}
