package kaptainwutax.featureutils.structure.generator.piece.village;

import kaptainwutax.mcutils.util.data.Pair;
import kaptainwutax.mcutils.util.data.Quad;
import kaptainwutax.mcutils.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DesertVillageJigsawBlocks {
	public static final HashMap<String, List<Pair<Quad<String, String, String, String>, BPos>>> JIGSAW_BLOCKS = new HashMap<String, List<Pair<Quad<String, String, String, String>, BPos>>>() {{
		this.put("desert/desert_lamp_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "cut_sandstone"), new BPos(0, 0, 0))
		));
		this.put("desert/houses/desert_animal_pen_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/animals", "bottom", "bottom", "grass_block"), new BPos(2, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone_stairs[facing=south]"), new BPos(4, 0, 0))
		));
		this.put("desert/houses/desert_animal_pen_2", Arrays.asList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone_stairs[facing=south]"), new BPos(4, 0, 0)),
			new Pair<>(new Quad<>("village/common/animals", "bottom", "bottom", "grass_block"), new BPos(6, 0, 3))
		));
		this.put("desert/houses/desert_armorer_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(0, 1, 4))
		));
		this.put("desert/houses/desert_butcher_shop_1", Arrays.asList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 0, 3)),
			new Pair<>(new Quad<>("village/common/butcher_animals", "bottom", "bottom", "grass_block"), new BPos(6, 0, 6))
		));
		this.put("desert/houses/desert_cartographer_house_1", Arrays.asList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 0, 5)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(5, 0, 0))
		));
		this.put("desert/houses/desert_farm_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "cut_sandstone"), new BPos(0, 0, 3))
		));
		this.put("desert/houses/desert_farm_2", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone_stairs[facing=east]"), new BPos(0, 1, 3))
		));
		this.put("desert/houses/desert_fisher_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "sand"), new BPos(0, 0, 9)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 6))
		));
		this.put("desert/houses/desert_fletcher_house_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 4))
		));
		this.put("desert/houses/desert_large_farm_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 2, 6))
		));
		this.put("desert/houses/desert_library_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(2, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(3, 1, 0))
		));
		this.put("desert/houses/desert_mason_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 4))
		));
		this.put("desert/houses/desert_medium_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 2)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 4)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "air"), new BPos(0, 1, 3))
		));
		this.put("desert/houses/desert_medium_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(4, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(7, 2, 2))
		));
		this.put("desert/houses/desert_shepherd_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/sheep", "bottom", "bottom", "sand"), new BPos(3, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 4))
		));
		this.put("desert/houses/desert_small_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(1, 1, 3))
		));
		this.put("desert/houses/desert_small_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "sand"), new BPos(0, 0, 3)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "sand"), new BPos(1, 0, 1)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 2))
		));
		this.put("desert/houses/desert_small_house_3", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(2, 0, 1)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 5))
		));
		this.put("desert/houses/desert_small_house_4", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(3, 1, 4))
		));
		this.put("desert/houses/desert_small_house_5", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 0))
		));
		this.put("desert/houses/desert_small_house_6", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(2, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "air"), new BPos(0, 1, 2))
		));
		this.put("desert/houses/desert_small_house_7", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(5, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 1))
		));
		this.put("desert/houses/desert_small_house_8", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(2, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(1, 1, 0))
		));
		this.put("desert/houses/desert_tannery_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 2, 0))
		));
		this.put("desert/houses/desert_temple_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 0, 5))
		));
		this.put("desert/houses/desert_temple_2", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 5))
		));
		this.put("desert/houses/desert_tool_smith_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 3, 5))
		));
		this.put("desert/houses/desert_weaponsmith_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone_stairs[facing=south]"), new BPos(5, 0, 0))
		));
		this.put("desert/streets/corner_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(2, 0, 1)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "sand"), new BPos(5, 0, 5)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 4)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 5)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(5, 1, 0))
		));
		this.put("desert/streets/corner_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 4)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 1)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(4, 1, 5))
		));
		this.put("desert/streets/crossroad_01", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(5, 0, 7)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(10, 0, 12)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 7)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 6)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 6)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 8)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(7, 1, 0)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(7, 1, 14)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 2)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 3)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 7))
		));
		this.put("desert/streets/crossroad_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 8)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(5, 0, 5)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(9, 0, 1)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(5, 1, 0)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(5, 1, 10)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(10, 1, 5))
		));
		this.put("desert/streets/crossroad_03", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(4, 1, 2))
		));
		this.put("desert/streets/square_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 13)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "smooth_sandstone"), new BPos(10, 0, 10)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 12)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 10)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 10)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(6, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 9)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 9)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(9, 1, 9)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(9, 1, 15)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 9)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 15)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(12, 1, 12))
		));
		this.put("desert/streets/square_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(0, 0, 10)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(4, 0, 8)),
			new Pair<>(new Quad<>("empty", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 5)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 11)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 8))
		));
		this.put("desert/streets/straight_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 0)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(13, 0, 0)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 3)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 3)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(12, 1, 3)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(14, 1, 2))
		));
		this.put("desert/streets/straight_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(5, 0, 16)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(12, 0, 17)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 14)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 13)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 13)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(11, 1, 13)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(14, 1, 14))
		));
		this.put("desert/streets/straight_03", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 1)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(3, 1, 1))
		));
		this.put("desert/streets/turn_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(2, 1, 0))
		));
		this.put("desert/terminators/terminator_01", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "street", "street", "structure_void"), new BPos(0, 1, 1))
		));
		this.put("desert/terminators/terminator_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(2, 0, 2)),
			new Pair<>(new Quad<>("empty", "street", "street", "structure_void"), new BPos(0, 1, 1))
		));
		this.put("desert/town_centers/desert_meeting_point_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/iron_golem", "bottom", "bottom", "smooth_sandstone"), new BPos(9, 0, 1)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(11, 0, 0)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(15, 0, 1)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(15, 0, 7)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 2)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 3)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 4)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 5)),
			new Pair<>(new Quad<>("village/desert/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 6)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "structure_void"), new BPos(9, 1, 6)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(12, 1, 0)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(12, 1, 8)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(16, 1, 4))
		));
		this.put("desert/town_centers/desert_meeting_point_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(1, 0, 1)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(1, 0, 8)),
			new Pair<>(new Quad<>("village/common/iron_golem", "bottom", "bottom", "smooth_sandstone"), new BPos(1, 0, 10)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(4, 0, 10)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(10, 0, 3)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(10, 0, 10)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(5, 1, 11)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(6, 1, 0)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(11, 1, 6))
		));
		this.put("desert/town_centers/desert_meeting_point_3", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 0)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(2, 0, 12)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "sand"), new BPos(3, 0, 10)),
			new Pair<>(new Quad<>("village/common/iron_golem", "bottom", "bottom", "sand"), new BPos(4, 0, 11)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "sand"), new BPos(6, 0, 10)),
			new Pair<>(new Quad<>("village/desert/villagers", "bottom", "bottom", "sand"), new BPos(8, 0, 5)),
			new Pair<>(new Quad<>("village/desert/decor", "bottom", "bottom", "sand"), new BPos(13, 0, 11)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(0, 1, 7)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "structure_void"), new BPos(6, 1, 4)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "structure_void"), new BPos(9, 1, 9)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(12, 1, 14)),
			new Pair<>(new Quad<>("village/desert/streets", "street", "street", "structure_void"), new BPos(14, 1, 8))
		));
		this.put("desert/villagers/baby", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("desert/villagers/nitwi", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("desert/villagers/unemployed", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("desert/zombie/houses/desert_medium_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "structure_void"), new BPos(3, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 3))
		));
		this.put("desert/zombie/houses/desert_medium_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(4, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(7, 2, 2))
		));
		this.put("desert/zombie/houses/desert_small_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(1, 1, 3))
		));
		this.put("desert/zombie/houses/desert_small_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "sand"), new BPos(0, 0, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "sand"), new BPos(1, 0, 1)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 2))
		));
		this.put("desert/zombie/houses/desert_small_house_3", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(2, 0, 1)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 5))
		));
		this.put("desert/zombie/houses/desert_small_house_4", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(3, 1, 4))
		));
		this.put("desert/zombie/houses/desert_small_house_5", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 0))
		));
		this.put("desert/zombie/houses/desert_small_house_6", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(1, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(0, 1, 3))
		));
		this.put("desert/zombie/houses/desert_small_house_7", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(5, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 1))
		));
		this.put("desert/zombie/houses/desert_small_house_8", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/villagers", "bottom", "bottom", "smooth_sandstone"), new BPos(2, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_sandstone"), new BPos(1, 1, 0))
		));
		this.put("desert/zombie/streets/corner_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(2, 0, 1)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "sand"), new BPos(5, 0, 5)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 4)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 5)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(5, 1, 0))
		));
		this.put("desert/zombie/streets/corner_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 4)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 1)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 5))
		));
		this.put("desert/zombie/streets/crossroad_01", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(5, 0, 7)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(10, 0, 12)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 7)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 6)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 6)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 8)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(7, 1, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(7, 1, 14)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 2)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 7))
		));
		this.put("desert/zombie/streets/crossroad_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 8)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(5, 0, 5)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(9, 0, 1)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(5, 1, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(5, 1, 10)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(10, 1, 5))
		));
		this.put("desert/zombie/streets/crossroad_03", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 2))
		));
		this.put("desert/zombie/streets/square_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "smooth_sandstone"), new BPos(3, 0, 13)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "smooth_sandstone"), new BPos(10, 0, 10)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 12)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 10)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 10)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(6, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 9)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 9)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(9, 1, 9)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(9, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 9)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 15)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(12, 1, 12))
		));
		this.put("desert/zombie/streets/square_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(0, 0, 10)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(4, 0, 8)),
			new Pair<>(new Quad<>("empty", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 5)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 11)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 8))
		));
		this.put("desert/zombie/streets/straight_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(13, 0, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(12, 1, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(14, 1, 2))
		));
		this.put("desert/zombie/streets/straight_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(5, 0, 16)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(12, 0, 17)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 14)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 13)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 13)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(11, 1, 13)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(14, 1, 14))
		));
		this.put("desert/zombie/streets/straight_03", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 1)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(3, 1, 1))
		));
		this.put("desert/zombie/streets/turn_01", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 0))
		));
		this.put("desert/zombie/terminators/terminator_02", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(2, 0, 2)),
			new Pair<>(new Quad<>("empty", "street", "street", "structure_void"), new BPos(0, 1, 1))
		));
		this.put("desert/zombie/town_centers/desert_meeting_point_1", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 2)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 4)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 5)),
			new Pair<>(new Quad<>("village/desert/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 6)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "structure_void"), new BPos(9, 1, 6)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(12, 1, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(12, 1, 8)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(16, 1, 4))
		));
		this.put("desert/zombie/town_centers/desert_meeting_point_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(1, 0, 1)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "smooth_sandstone"), new BPos(10, 0, 3)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(5, 1, 11)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(6, 1, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(11, 1, 6))
		));
		this.put("desert/zombie/town_centers/desert_meeting_point_3", Arrays.asList(
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(1, 0, 0)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(2, 0, 12)),
			new Pair<>(new Quad<>("village/desert/zombie/decor", "bottom", "bottom", "sand"), new BPos(13, 0, 11)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 7)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "structure_void"), new BPos(6, 1, 4)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "structure_void"), new BPos(9, 1, 9)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(12, 1, 14)),
			new Pair<>(new Quad<>("village/desert/zombie/streets", "street", "street", "structure_void"), new BPos(14, 1, 8))
		));
		this.put("desert/zombie/villagers/nitwi", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("desert/zombie/villagers/unemployed", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));

	}};
}
